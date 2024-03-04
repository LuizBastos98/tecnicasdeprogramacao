/*
 * Copyright (C) 2024 Luiz Bastos <luizfelipebastossantana@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lista2.tecnicasdeprogramacao;

import java.util.Scanner;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 03/03/2024
 * @brief Class Ex4
 */
import java.util.*;

public class Ex4 {

    public static void main(String[] args) {
        // Utilizado o Scan para separar a entrada de texto.
        Scanner ler = new Scanner(System.in);

        int x, y, z;

        System.out.println("Informe o valor de X: ");
        x = ler.nextInt();
        System.out.println("Informe o valor de Y: ");
        y = ler.nextInt();
        System.out.println("Informe o valor de Z: ");
        z = ler.nextInt();

        System.out.println((x * y) / z);

    }
}
