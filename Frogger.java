import java.awt.*
import java.awt.event*;
import acm.graphics.*;
import acm.program.*;


public class Frogger extends Graphics {
	
	private static final int SQRE_SZ = 75;
	private static final int NUMROWS = 4;
	private static final int NUMCOL = 7;
	
	private GImage frogger;
	private double xfrog;
	private double yfrog;
	public static final int APP_WIDTH = NUMCOL * SQRE_SZ;
	public static final int APP_HEIGHT = NROWS * SQRE_SZ;
	
	public void run() {
		
		frogger = new GImage("images.jpg");
		xfrog = (NUMCOL / 2.0 + 0.5) * SQRE_SZ;
		yfrog = (NUMROW - 0.5) * SQRE_SZ;
		add(frogger, xfrog - frogger.getwidth() / 2, froggy.getHeight() / 2 );
		
		addMouseListeners();
		
	}
	
	public void mouseClicked(MouseEvent e) {
		double sl_x = e.getX();
		double sl_y = e.getY();
		
		if(Math.abs(sl_x - xfrog) > Math.abs(sl_y - yfrog)) {
			if((sl_x > xfrog) {
				moveTheFrog(SQRE_SZ, 0);
			} else {
				moveTheFrog(-SQRE_SZ, 0);
			} 
		} else {
			if(sl_y > yfrog) {
				moveTheFrog(0, SQRE_SZ);
			} else {
				moveTheFrog(0, -SQRE_SZ);
			}
		}
	}
	
	private void moveTheFrong(double xdr, double ydr) {
		if(theFroggerWorld(xfrog + xdr, yfrog + ydr)) {
				xfrog += xdr;
				yfrog += ydr;
				frogger.move(xdr,ydr);
			
		}
		
	}
	
	private boolean theFroggerWorld(double x, double y) {
		return(x >= 0 && x <= NUMCOL * SQRE_SZ && y >= 0 && y <= NUMROWS * SQRE_SZ);
	}
}