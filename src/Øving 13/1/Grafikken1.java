import static com.jogamp.opengl.GL2.*;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_MODELVIEW;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_PROJECTION;
import com.jogamp.opengl.util.FPSAnimator;

class Grafikken1 extends GLCanvas implements GLEventListener{

	private GLCanvas canvas;
	private float angle;
	private GLU glu = new GLU();

	public Grafikken1(){
		this.addGLEventListener(this);
	}

	public void init(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

		gl.glMatrixMode(GL_PROJECTION);
		gl.glLoadIdentity();
		glu.gluPerspective(120.0, 1.25, 2.0, 20.0);
		gl.glMatrixMode(GL_MODELVIEW);
	}

	public void reshape(GLAutoDrawable glDrawable, int i, int i1, int width, int heigth){}

	public void dispose(GLAutoDrawable d){};

	//private float[] p0 = {(
	public void tegn1(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

		gl.glLoadIdentity();
		gl.glTranslatef(-1.5f, 0.0f, -5.0f);
		//gl.glTransform
		gl.glColor3f(0.0f, 1.0f, 0.0f);

		//--Oppgave 2.1--\\
		//Start tegne figurene

		//GL_POINTS
		gl.glBegin(GL_POINTS);
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();

		//GL_LINES
		gl.glTranslatef(-5.0f, 0.0f, 0.0f);
		gl.glBegin(GL_LINES);
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();


		//GL_LINE_STRIP
		gl.glTranslatef(0.0f, -5.0f, 0.0f);
		gl.glBegin(GL_LINE_STRIP);//start
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();//slutt

		//GL_LINE_LOOP
		gl.glTranslatef(0.0f, 10.0f, 0.0f);
		gl.glBegin(GL_LINE_LOOP);//start
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();//slutt


		//GL_TRIANGLES
		gl.glTranslatef(5.0f, 0.0f, 0.0f);
		gl.glBegin(GL_TRIANGLES);//start
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();//slutt


		//GL_TRIANGLE_STRIP
		gl.glTranslatef(5.0f, 0.0f, 0.0f);
		gl.glBegin(GL_TRIANGLE_STRIP);//start
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();//slutt


		//GL_TRIANGLE_FAN
		gl.glTranslatef(0.0f, -5.0f, 0.0f);
		gl.glBegin(GL_TRIANGLE_FAN);//start
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();//slutt

		//GL_QUADS
		gl.glTranslatef(0.0f, -5.0f, 0.0f);
		gl.glBegin(GL_QUADS);//start
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();//slutt

		//GL_QUAD_STRIP
		gl.glTranslatef(-5.0f, 0.0f, 0.0f);
		gl.glBegin(GL_QUAD_STRIP);//start
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();//slutt

		//GL_POLYGON
		gl.glTranslatef(10.0f, 0.0f, 0.0f);
		gl.glBegin(GL_POLYGON);//start
		gl.glVertex3f(0.0f, 2.0f, 0.0f);  //P0
		gl.glVertex3f(1.5f, 1.5f, 0.0f);  //P1
		gl.glVertex3f(2.0f, 0.0f, 0.0f);  //P2
		gl.glVertex3f(1.5f, -1.5f, 0.0f); //P3
		gl.glVertex3f(0.0f, -2.0f, 0.0f); //P4
		gl.glVertex3f(-1.5f, -1.5f, 0.0f);//P5
		gl.glVertex3f(-2.0f, 0.0f, 0.0f); //P6
		gl.glVertex3f(-1.5f, 1.5f, 0.0f); //P7
		gl.glEnd();//slutt*/

	}

	public void display(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		tegn1(glDrawable);
		gl.glFlush();
	}
}