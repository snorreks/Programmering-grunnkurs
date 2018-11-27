package Øving13

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.gl2.GLUT;

import static com.jogamp.opengl.GL2.*;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_MODELVIEW;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_PROJECTION;

class Grafikken4 extends GLCanvas implements GLEventListener{

	private GLCanvas canvas;
	private float angle;
	private GLU glu = new GLU();
	private GLUT glut = new GLUT();

	public Grafikken4(){
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

    public void dispose(GLAutoDrawable d) {
    }

    //private float[] p0 = {(
	public void drawGLScene(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

		gl.glLoadIdentity();
		gl.glTranslatef(-1.5f, 0.0f, -5.0f);
		//gl.glTransform
		gl.glColor3f(0.0f, 1.0f, 0.0f);

		//--Oppgave 2.4--\\
		//Start tegne figurene

		//Kube 1

		glu.gluLookAt(1.0, 0.0, 5.0, 0.0, -1.5f, 0.0f, -5.0f, 1.0, 0.0);
		glut.glutWireCube(2.0f);

		//Kube 2
		glu.gluLookAt(0.0, 0.0, 5.0, 0.0, -1.5f, 0.0f, -5.0f, 1.0, 0.0);
		glut.glutWireCube(2.0f);

		//Kube 1
		glu.gluLookAt(-1.0, 0.0, 5.0, 0.0, -1.5f, 0.0f, -5.0f, 1.0, 0.0);
		glut.glutWireCube(2.0f);



	}

	public void display(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		drawGLScene(glDrawable);
		gl.glFlush();
	}
}