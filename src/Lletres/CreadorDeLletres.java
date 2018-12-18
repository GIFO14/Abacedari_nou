package Lletres;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author mblan
 */
public class CreadorDeLletres {

    private static JLabel imatge_a, imatge_b, imatge_c, imatge_d, imatge_e, imatge_f, imatge_g, imatge_h, imatge_i, imatge_j, imatge_k, imatge_l, imatge_m, imatge_n, imatge_o, imatge_p, imatge_q, imatge_r, imatge_s, imatge_t, imatge_u, imatge_v, imatge_w, imatge_x, imatge_y, imatge_z;
    public static Lletra a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

    public static void CrearLletres() {

        imatge_a.setIcon(new ImageIcon("Imatges/quadrat(A,E,I,M,Q,U).png"));
        a = new Lletra(imatge_a, 0, 0);

        imatge_b.setIcon(new ImageIcon("Imatges/triangle(B,F,J,N,R,V).png"));
        b = new Lletra(imatge_b, 0, 0);

        imatge_c.setIcon(new ImageIcon("Imatges/espiral(C,G,K,O,S,W).png"));
        c = new Lletra(imatge_c, 0, 0);

        imatge_d.setIcon(new ImageIcon("Imatges/euro(D,H,L,P,T,X).png"));
        d = new Lletra(imatge_d, 0, 0);

        imatge_e.setIcon(new ImageIcon("Imatges/quadrat(A,E,I,M,Q,U).png"));
        e = new Lletra(imatge_e, 0, 0);

        imatge_f.setIcon(new ImageIcon("Imatges/triangle(B,F,J,N,R,V).png"));
        f = new Lletra(imatge_f, 0, 0);

        imatge_g.setIcon(new ImageIcon("Imatges/espiral(C,G,K,O,S,W).png"));
        g = new Lletra(imatge_g, 0, 0);

        imatge_h.setIcon(new ImageIcon("Imatges/euro(D,H,L,P,T,X).png"));
        h = new Lletra(imatge_h, 0, 0);

        imatge_i.setIcon(new ImageIcon("Imatges/quadrat(A,E,I,M,Q,U).png"));
        i = new Lletra(imatge_i, 0, 0);

        imatge_j.setIcon(new ImageIcon("Imatges/triangle(B,F,J,N,R,V).png"));
        j = new Lletra(imatge_j, 0, 0);

        imatge_k.setIcon(new ImageIcon("Imatges/espiral(C,G,K,O,S,W).png"));
        k = new Lletra(imatge_k, 0, 0);

        imatge_l.setIcon(new ImageIcon("Imatges/euro(D,H,L,P,T,X).png"));
        l = new Lletra(imatge_l, 0, 0);

        imatge_m.setIcon(new ImageIcon("Imatges/quadrat(A,E,I,M,Q,U).png"));
        m = new Lletra(imatge_m, 0, 0);

        imatge_n.setIcon(new ImageIcon("Imatges/triangle(B,F,J,N,R,V).png"));
        n = new Lletra(imatge_n, 0, 0);

        imatge_o.setIcon(new ImageIcon("Imatges/espiral(C,G,K,O,S,W).png"));
        o = new Lletra(imatge_o, 0, 0);

        imatge_p.setIcon(new ImageIcon("Imatges/euro(D,H,L,P,T,X).png"));
        p = new Lletra(imatge_p, 0, 0);

        imatge_q.setIcon(new ImageIcon("Imatges/quadrat(A,E,I,M,Q,U).png"));
        q = new Lletra(imatge_q, 0, 0);

        imatge_r.setIcon(new ImageIcon("Imatges/triangle(B,F,J,N,R,V).png"));
        r = new Lletra(imatge_r, 0, 0);

        imatge_s.setIcon(new ImageIcon("Imatges/espiral(C,G,K,O,S,W).png"));
        s = new Lletra(imatge_s, 0, 0);

        imatge_t.setIcon(new ImageIcon("Imatges/euro(D,H,L,P,T,X).png"));
        t = new Lletra(imatge_t, 0, 0);

        imatge_u.setIcon(new ImageIcon("Imatges/quadrat(A,E,I,M,Q,U).png"));
        u = new Lletra(imatge_u, 0, 0);

        imatge_v.setIcon(new ImageIcon("Imatges/triangle(B,F,J,N,R,V).png"));
        v = new Lletra(imatge_v, 0, 0);

        imatge_w.setIcon(new ImageIcon("Imatges/espiral(C,G,K,O,S,W).png"));
        w = new Lletra(imatge_w, 0, 0);

        imatge_x.setIcon(new ImageIcon("Imatges/euro(D,H,L,P,T,X).png"));
        x = new Lletra(imatge_x, 0, 0);

        imatge_y.setIcon(new ImageIcon("Imatges/lletra copyleft(Y).png"));
        y = new Lletra(imatge_y, 0, 0);

        imatge_z.setIcon(new ImageIcon("Imatges/logo(Z).png"));
        z = new Lletra(imatge_z, 0, 0);

    }

    public void f() {
        JOptionPane.showMessageDialog(null, imatge_a);
    }

}
