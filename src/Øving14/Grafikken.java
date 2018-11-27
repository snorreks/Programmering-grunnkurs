package Øving14;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.opengl.util.gl2.GLUT;

import static com.jogamp.opengl.GL2.*;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_MODELVIEW;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_PROJECTION;

public class Grafikken extends GLCanvas implements GLEventListener {

	 	static final float cornerPositions[][] = {{-1f,-1f,1f}, {-1f,1f,1f}, {1f,1f,1f}, {1f,-1f,1f}, {-1f,-1f,-1f}, {-1f,1f,-1f}, {1f,1f,-1f}, {1f,-1f,-1f}};
		static final float colors[][] = {{1.0f, 0.5f, 1.0f}, {1.0f, 1.0f, 0.0f}, {0.0f, 1.0f, 1.0f}, {1.0f, 0.0f, 0.0f}, {0.0f, 1.0f, 0.0f}, {0.0f, 0.0f, 1.0f}};

		float [] norm = new float[3];
		public float rotasjonsvinkel = 0.0f;

	    private GLCanvas canvas;
	    private float angle;
	    private GLU glu = new GLU();
	    private GLUT glut = new GLUT();

	    public Grafikken() {
	        addGLEventListener(this);
	        FPSAnimator animate = new FPSAnimator(this, 60);
	        animate.start();
	    }

	    public void init(GLAutoDrawable glDrawable) {
	    	GL2 gl = glDrawable.getGL().getGL2();
	    	gl.glEnable(GL_DEPTH_TEST);
	        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // Sets the background colour to white
	        gl.glMatrixMode(GL_PROJECTION); // Select The Projection Matrix
	        gl.glLoadIdentity(); // Reset the view matrix to the identity matrix
	        glu.gluPerspective(45.0, 1.25, 2.0, 50.0); // Specify the projection matrix (fov, w/h, near plane, far plane)
	        gl.glMatrixMode(GL_MODELVIEW);
	    }

	    public boolean normalize(float [] C){ // Normalizes a vector C
	    	float nC = (float)(Math.sqrt( C[0]* C[0] + C[1]* C[1] + C[2]* C[2]));
	    	if (nC >0.000001f || nC < -0.00001f){
	    		C[0] = C[0] / nC; C[1] = C[1] / nC; C[2] = C[2 ]/ nC;
	    		return true;
	    	} else return false;
	    }

	    public float [] normCrossProd( float[] A, float [] B){ // Calculates the cross-product of two vectors A and B
	    	// and normalize the result vector out ( surface normal )
	    	float [] out = new float[3];
	    	out[0] = A[1]*B[2] - A[2] * B[1]; out[1] = A[2]*B[0]-A[0]*B[2]; out[2] = A[0]*B[1] - A[1]*B[0];
	    	if (normalize( out)) return out;
	    	else return null;
	    }

	    // Draw a polygonside between the points a,b,c og d on the cube
	    public void drawSide( int a, int b, int c, int d, GL2 gl) {

	    	float [] v1 = { cornerPositions[b][0]-cornerPositions[a][0], cornerPositions[b][1]-cornerPositions[a][1], cornerPositions[b][2]-cornerPositions[a][2]}; // vector ab (v1)
	    	float [] v2 = { cornerPositions[d][0]-cornerPositions[a][0], cornerPositions[d][1]-cornerPositions[a][1], cornerPositions[d][2]-cornerPositions[a][2]}; // vector ad (v2)

	    	norm = normCrossProd( v1, v2); // Calculates a surface normal from v1 and v2 on a cube side

	    	gl.glColor3fv(colors[a],0); // Sets the color on the cubeside

	    	gl.glBegin(GL2.GL_POLYGON);
	    	gl.glNormal3fv(norm, 0); // Adress the surface normal to point a
	    		gl.glVertex3fv(cornerPositions[a],0); //dersom ikke gl.glVertex3fv(); virker bruk (gl.glVertex3f(hp[a][0],hp[a][1],hp[a][2]);
	    		gl.glVertex3fv(cornerPositions[b],0);
	    		gl.glVertex3fv(cornerPositions[c],0);
	    		gl.glVertex3fv(cornerPositions[d],0);
	    	gl.glEnd();
	    }

	    // Draw the cube by calling polygon() The order of the points on the cube side ensure pos outward normals
	    public void tegnKube(GL2 gl){
	    	drawSide( 0, 4, 7, 3,gl);
	    	drawSide( 4, 5, 6, 7,gl);
	    	drawSide( 5, 4, 0, 1,gl);
	    	drawSide( 1, 2, 6, 5,gl);
	    	drawSide( 2, 1, 0, 3,gl);
	    	drawSide( 3, 7, 6, 2,gl);
	    }

	    /* Mathod used for drawing */
	    public void drawGLScene(GLAutoDrawable glDrawable) {
	    	GL2 gl = glDrawable.getGL().getGL2(); //Get the GL2 object from glDrawable
	    	gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	    	gl.glLoadIdentity();
	    	glu.gluLookAt(3.0,2.0,3.0, 0.0,0.0,0.0, 0.0,1.0,0.0);
	    	gl.glRotatef(rotasjonsvinkel, 0.0f, 1.0f, 0.0f);
	    	tegnKube(gl);
	    	rotasjonsvinkel += 1.0f;
	    }

	    public void display(GLAutoDrawable glDrawable) {
	        GL2 gl = glDrawable.getGL().getGL2();

	        // Oppgave 3.2
	        drawGLScene(glDrawable); // Calls DrawGLScene
	        gl.glFlush(); // release GL
	    }

		@Override
		public void dispose(GLAutoDrawable drawable) {
			// TODO Auto-generated method stub

		}

		@Override
		public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
			// TODO Auto-generated method stub

		}
}