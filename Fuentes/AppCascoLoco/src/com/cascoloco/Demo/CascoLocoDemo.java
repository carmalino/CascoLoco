package com.cascoloco.Demo;

import java.util.Scanner;

import com.cascoloco.controller.*;
import com.cascoloco.model.*;

public class CascoLocoDemo {

	private static Scanner input;	
	private static ControllerCliente objCliente;
	private static ControllerProducto objProducto;
	private static ControllerPreRegistro objPreRegistro;

	public static void main(String[] args) {
		int userChoice;
        int userChoise1;
        
        do {
        	userChoice = menu();
        	switch (userChoice) {
			case 1:
				do {
					userChoise1 = menuCliente();
				}while(userChoise1 != 2);				
				break;
			case 2:
				do {
					userChoise1 = menuProducto();
				}while(userChoise1 != 2);				
				break;
			case 3:
				do {
					userChoise1 = menuPreRegistro();
				}while(userChoise1 != 3);				
				break;
			default:
				break;
			}
        }while(userChoice !=4);
        

	}
	
	public static int menu() {

        int selection;
        input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Menu principal - Seleccione una opción");
        System.out.println("-------------------------\n");
        System.out.println("1 - Clientes");
        System.out.println("2 - Productos");
        System.out.println("3 - PreRegistro");
        System.out.println("4 - salir");

        selection = input.nextInt();
        return selection;    
    }
	
	public static int menuCliente() {
		int selection;
        input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Menu Clientes - Seleccione una opción");
        System.out.println("-------------------------\n");
        System.out.println("1 - Ver Clientes");        
        System.out.println("2 - salir");

        selection = input.nextInt();
        if(selection==1)
        {
        	objCliente = new ControllerCliente();
        	objCliente.verClientes();
        }
        return selection;
	}
	public static int menuProducto() {
		int selection;
        input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Menu Productos - Seleccione una opción");
        System.out.println("-------------------------\n");
        System.out.println("1 - Ver Productos");        
        System.out.println("2 - salir");

        selection = input.nextInt();
        if(selection==1)
        {
        	objProducto = new ControllerProducto();
        	objProducto.verProductos();
        }
        return selection;
	}
	public static int menuPreRegistro() {
		int selection;
		String identificacionEmpresa=null;
		int idCliente = 0;
		String referenciaProducto=null;
		int idProducto = 0;
		int cantidad =0;
        input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Menu Pre-registro - Seleccione una opción");
        System.out.println("-------------------------\n");
        System.out.println("1 - Ver Preregistros");        
        System.out.println("2 - Insertar Preregistro");
        System.out.println("3 - salir");

        selection = input.nextInt();
        if(selection == 1)
        {
        	objPreRegistro = new ControllerPreRegistro();
        	objPreRegistro.verPreRegistros();
        }
        else if (selection==2) {
			PreRegistro preRegistro = new PreRegistro();
			objCliente = new ControllerCliente();
			do {
				System.out.print("Digite la identificacion de la empresa");
				identificacionEmpresa = input.next();
				idCliente = objCliente.esClienteValido(identificacionEmpresa);
			}while(idCliente== 0);
			
			
			objProducto = new ControllerProducto();
			do {
				System.out.print("Digite la referencia del producto valida:\n");
				referenciaProducto = input.next();	
				idProducto = objProducto.esProductoValido(referenciaProducto);				
			}
			while(idProducto == 0);
			
			System.out.print("Digite la cantidad de producto");
			cantidad = input.nextInt();
			
			preRegistro.setIdCliente(idCliente);
			preRegistro.setIdProducto(idProducto);
			preRegistro.setCantidad(cantidad);
			objPreRegistro = new ControllerPreRegistro();
			objPreRegistro.registrar(preRegistro);
			objPreRegistro.verPreRegistros();
		}
        return selection;
	}

}
