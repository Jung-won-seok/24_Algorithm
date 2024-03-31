package beakjoon;

import java.util.Scanner;

public class beak_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char arr[] = input.toCharArray();
        int a = -1, b = -1, c = -1, d = -1, e = -1, f = -1, g = -1, h = -1, i = -1, j = -1, k = -1, l = -1, m = -1, n = -1, o = -1, p = -1, q = -1, r = -1, s = -1, t = -1, u = -1, v = -1, w = -1, x = -1, y = -1, z = -1;
        int a_cnt = 0, b_cnt = 0, c_cnt = 0, d_cnt = 0, e_cnt = 0, f_cnt = 0, g_cnt = 0, h_cnt = 0, i_cnt = 0, j_cnt = 0, k_cnt = 0, l_cnt = 0, m_cnt = 0, n_cnt = 0,
                o_cnt = 0, p_cnt = 0, q_cnt = 0, r_cnt = 0, s_cnt = 0, t_cnt = 0, u_cnt = 0, v_cnt = 0, w_cnt = 0, x_cnt = 0, y_cnt = 0, z_cnt = 0;
        for (int A = 0; A < arr.length; A++) {
            if (arr[A] == 'a' && a_cnt == 0) {
                a = A;
                a_cnt++;
                continue;
            } else if (arr[A] == 'b' && b_cnt == 0) {
                b = A;
                b_cnt++;
                continue;
            } else if (arr[A] == 'c' && c_cnt == 0) {
                c = A;
                c_cnt++;
                continue;
            } else if (arr[A] == 'd' && d_cnt == 0) {
                d = A;
                d_cnt++;
                continue;
            } else if (arr[A] == 'e' && e_cnt == 0) {
                e = A;
                e_cnt++;
                continue;
            } else if (arr[A] == 'f' && f_cnt == 0) {
                f = A;
                f_cnt++;
                continue;
            } else if (arr[A] == 'g' && g_cnt == 0) {
                g = A;
                g_cnt++;
                continue;
            } else if (arr[A] == 'h' && h_cnt == 0) {
                h = A;
                h_cnt++;
                continue;
            } else if (arr[A] == 'i' && i_cnt == 0) {
                i = A;
                i_cnt++;
                continue;
            } else if (arr[A] == 'j' && j_cnt == 0) {
                j = A;
                j_cnt++;
                continue;
            } else if (arr[A] == 'k' && k_cnt == 0) {
                k = A;
                k_cnt++;
                continue;
            } else if (arr[A] == 'l' && l_cnt == 0) {
                l = A;
                l_cnt++;
                continue;
            } else if (arr[A] == 'm' && m_cnt == 0) {
                m = A;
                m_cnt++;
                continue;
            } else if (arr[A] == 'n' && n_cnt == 0) {
                n = A;
                n_cnt++;
                continue;
            } else if (arr[A] == 'o' && o_cnt == 0) {
                o = A;
                o_cnt++;
                continue;
            } else if (arr[A] == 'p' && p_cnt == 0) {
                p = A;
                p_cnt++;
                continue;
            } else if (arr[A] == 'q' && q_cnt == 0) {
                q = A;
                q_cnt++;
                continue;
            } else if (arr[A] == 'r' && r_cnt == 0) {
                r = A;
                r_cnt++;
                continue;
            } else if (arr[A] == 's' && s_cnt == 0) {
                s = A;
                s_cnt++;
                continue;
            } else if (arr[A] == 't' && t_cnt == 0) {
                t = A;
                t_cnt++;
                continue;
            } else if (arr[A] == 'u' && u_cnt == 0) {
                u = A;
                u_cnt++;
                continue;
            } else if (arr[A] == 'v' && v_cnt == 0) {
                v = A;
                v_cnt++;
                continue;
            } else if (arr[A] == 'w' && w_cnt == 0) {
                w = A;
                w_cnt++;
                continue;
            } else if (arr[A] == 'x' && x_cnt == 0) {
                x = A;
                x_cnt++;
                continue;
            } else if (arr[A] == 'y' && y_cnt == 0) {
                y = A;
                y_cnt++;
                continue;
            } else if (arr[A] == 'z' && z_cnt == 0) {
                z = A;
                z_cnt++;
                continue;
            }
        }
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q + " " + r + " " + s + " " + t + " " + u + " " + v + " " + w + " " + x + " " + y + " " + z);
    }
}
