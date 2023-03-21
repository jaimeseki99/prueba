package business;

/**
 * Esta es la clase persona, en la cuál quedan definidos los atributos propios de la clase, un Enum para crear un dato de tipo departamento que recoge el Departamento al que pertenece la persona,
 * dos constructores (uno sin parámetros y otro con parámetros)
 * y los getters y los setters de cada uno de los atributos
 * @author Jaime Serrano Quílez
 * @version Final
 * @date 24-02-2023
 *
 */
public class Person {
    
	/**
	 * Declaración de Department, que es un Enum para crear un nuevo tipo de dato que servirá para almacenar el departamento de cada uno de los empleados (serán 3 que se podrán coger a partir de un comboBox)
	 *
	 */
	public enum Department {TIC, MARKETING, ADMINISTRACIÓN}
	
	/**
	 * Declaración de los atributos de la clase. El atributo codigo es estático. Se incializa a 0 y con la creación de cada persona se autoincrementa, y su valor lo recoge el atributo codEmpleado.
	 */
    private String nombre;
    private String pais;
    private String fechaNacimiento;
    private String movil;
    private String email;
    private String numeroSeguridadSocial;
    private String imagen; //Health plan beneficiary number
    private String cuentaBancaria; //Bank account numbers
    private Department departamento;
    private String fechaIncorp;
    private static int codigo=0;
    private int codEmpleado;
    private int sueldo;
   
    /*
     * Primer constructor de la clase, sin parámetros
     */
    public Person() {
    	
    }
    
    /**
     *  Segundo constructor de la clase, con los siguientes parámetros. En este constructor el atributo estático codigo se autoincrementa y su valor lo recoge el atributo codEmpleado
     * @param nombre (Se establece el nombre)
     * @param pais (Se establece el país de origen de la persona)
     * @param fechaNacimiento  (Se establece la fecha de nacimiento en formato YYYY-MM-DD)
     * @param movil (Se establece el número de móvil, que debe empezar por 6 o 7 y contener 9 dígitos)
     * @param departamento (Se establece el departamento al que pertenece la persona. Se selecciona en un ComboBox, se pasa a String y ese String se pasa al tipo de dato Departamento)
     * @param email (Se establece el email)
     * @param numeroSeguridadSocial (Se establece el número de Seguridad Social, que debe contener 10 dígitos)
     * @param cuentaBancaria (Se establece el número de cuenta bancaria de la persona)
     * @param fechaIncorp (Se establece la fecha de incorporación a la empresa. Al igual que la fecha de nacimiento, se guarda en formato YYYY-MM-DD)
     * @param imagen (Se guarda la ruta absoluta de las imágenes)
     */
    public Person(String nombre, String pais, String fechaNacimiento, String movil, Department departamento, String email, String numeroSeguridadSocial, String cuentaBancaria, String fechaIncorp, String imagen, int sueldo) {
    	this.nombre=nombre;
    	this.pais=pais;
    	this.fechaNacimiento=fechaNacimiento;
    	this.movil=movil;
    	this.email=email;
    	this.numeroSeguridadSocial=numeroSeguridadSocial;
    	this.imagen=imagen;
    	this.cuentaBancaria=cuentaBancaria;
    	this.departamento=departamento;
    	this.fechaIncorp=fechaIncorp;
    	this.codEmpleado=codigo;
    	codigo++;
    	this.sueldo=sueldo;
    }
    
//Full face photos and comparable images
//Any unique identifying number, characteristic or code

    /*
     *  Método get del atributo codEmpleado
     *  @return el código de empleado
     */
	public int getCodEmpleado() {
		return codEmpleado;
	}

	/**
	 * Método set para establecer un nuevo valor al atributo codEmpleado
	 * @param codEmpleado
	 */
	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	/**
	 * Método get del atributo nombre
	 * @return el nombre de la persona
	 */
	public String getNombre() {
        return nombre;
    }
/**
 * Método set para establecer un nuevo valor al atributo nombre
 * @param nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Método get del atributo país
     *  @return el país de la persona
     */
    public String getPais() {
        return pais;
    }

    /**
     * Método set para establecer un nuevo valor al atributo país
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    /*
     * Método get del atributo fecha de nacimiento 
     *  @return la fecha de nacimiento de la persona
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Método set para establecer una nueva fecha de nacimiento
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /*
     * Método get del atributo movil
     *  @return el número de móvil de la persona
     */
    public String getMovil() {
        return movil;
    }

    /**
     * Método set para definir un nuevo número de teléfono móvil
     * @param movil
     */
    public void setMovil(String movil) {
        this.movil = movil;
    }

    /*
     * Método get del atributo email
     *  @return el email de la persona
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método set para definir un nuevo email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /*
     * Método get del atributo NumeroSeguridadSocial
     *  @return el número de seguridad social de la persona
     */
    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    /**
     * Método set para establecer un nuevo número de seguridad social
     * @param numeroSeguridadSocial
     */
    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    /*
     * Método get del atributo imagen
     *  @return la ruta absoluta de la imagen del perfil de la persona
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Método set para establecer una nueva imagen
     * @param imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /*
     * Método get del atributo cuentaBancaria
     *  @return el número de cuenta bancaria 
     */
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    /**
     * Método set para establecer un nuevo número de cuentaBancaria
     * @param cuentaBancaria
     */
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    /*
     * Método get del atributo departamento
     *  @return el nombre del departamento al que pertenece la persona
     */
    public Department getDepartamento() {
    	return departamento;
    }
    
    /**
     * Método set para establecer un nuevo departamento de la persona
     * @param departamento
     */
    public void setDepartmento(Department departamento) {
    	this.departamento = departamento;
    }
    
    /*
     * Método get del atributo fechaIncorporación
     *  @return la fecha de incorporación de la persona en formato YYYY-MM-DD
     */
	public String getFechaIncorp() {
		return fechaIncorp;
	}

	/**
	 * Método set para establecer una nueva fecha de incorporación a la empresa
	 * @param fechaIncorp
	 */
	public void setFechaIncorp(String fechaIncorp) {
		this.fechaIncorp = fechaIncorp;
	}

	/*
     * Método get del atributo codigo
     *  @return el codigo que se autoincrementa
     */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Método set para asignarle un nuevo valor al atributo codigo
	 * @param codigo
	 */
	public void setCode(int codigo) {
		Person.codigo = codigo;
	}

	/**
	 * Método get del atributo sueldo
	 * @return devuelve el sueldo de la persona
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * Método set para establecer un nuevo sueldo a la persona
	 * @param sueldo
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	

	}

	
    
    
    

