package Øving12.cheeki;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

import static com.jogamp.opengl.GL2.*;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_MODELVIEW;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_PROJECTION;

public class Grafikken extends GLCanvas implements GLEventListener{

	private GLCanvas canvas;
	private float angle;
	private GLU glu = new GLU();

	public Grafikken(){
		this.addGLEventListener(this);
	}

	public void init(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);

		gl.glMatrixMode(GL_PROJECTION);
		gl.glLoadIdentity();
		glu.gluPerspective(45.0, 1.25, 2.0, 9.0);
		gl.glMatrixMode(GL_MODELVIEW);
	}

	public void reshape(GLAutoDrawable glDrawable, int i, int i1, int width, int height){}

    public void dispose(GLAutoDrawable d) {
    }

    public void tegning1(GLAutoDrawable glad) {
		GL2 gl = glad.getGL().getGL2();
		gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

		gl.glLoadIdentity();
		gl.glTranslatef(-1.5f, 0.0f, -8.0f);
		gl.glColor3f(1.0f, 0.0f, 0.0f);

		//Tegn trekant nr 1
		gl.glBegin(GL_TRIANGLES);
		gl.glVertex3f(1.0f, 1.0f, 0.0f); //TOP
		gl.glVertex3f(0.0f, 0.0f, 0.0f); //Bottom left
		gl.glVertex3f(2.0f, 0.0f, 1.0f); //Bottom right
		gl.glEnd();

		//Tegn trekant nr 2
		gl.glColor3f(0.5f, 1.0f, 0.5f);
		gl.glBegin(GL_TRIANGLES);
		gl.glVertex3f(0.0f, 0.5f, 0.0f);
		gl.glVertex3f(-0.5f, 0.0f, 0.0f);
		gl.glVertex3f(1.0f, 0.0f, 0.0f);
		gl.glEnd();


		//Flytte figuren til h�yre med tre punkt
		gl.glTranslatef(3.0f, 0.0f, 0.0f);

		//endre fargen til gr�n
		gl.glColor3f(0.0f, 1.0f, 0.0f);

		//Tegn Firkant
		gl.glBegin(GL_QUADS);
		gl.glVertex3f(0.0f, 1.0f, 0.0f); //Top left
		gl.glVertex3f(1.0f, 1.0f, 0.0f); //Top right
		gl.glVertex3f(1.0f, 0.0f, 0.0f); //Bottom right
		gl.glVertex3f(0.0f, 0.0f, 0.0f); //Bottom left
		gl.glEnd();

		//Tegn
	}

	public void tegnSirkel(GLAutoDrawable glad){
		GL2 gl = glad.getGL().getGL2();
		gl.glLoadIdentity();
		gl.glTranslatef(-1.0f, -1.0f, -7.0f);
		gl.glColor3f(0.0f, 1.0f, 1.0f);
		int cPunkt = 1337;
		double angle = 0.0;
		gl.glBegin(GL_POLYGON);
		for(int i = 0; i < cPunkt; i++){
			angle = 2 * Math.PI * i / cPunkt;
			gl.glVertex2f((float)Math.cos(angle), (float)Math.sin(angle));
		}
		gl.glEnd();
	}

	public void display(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		tegning1(glDrawable);
		tegnSirkel(glDrawable);
		gl.glFlush();
	}
}