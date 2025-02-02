## a) Elementos UML y su mapeo en la Programación Orientada a Objetos (POO)

Al analizar los diagramas UML, encontramos los siguientes conceptos que se asemejan a los de la POO:

- **Clases:** Cliente, Pedido, Producto, Pago.
- **Atributos:** Nombre, descripción, precio en la clase Producto; fecha y estado en la clase Pedido.
- **Métodos:** `calcularCostoTotal()` en Pedido, `actualizarStock()` en Producto.
- **Relaciones:**
    - Asociación entre Pedido y Producto (Un pedido tiene múltiples productos).
    - Asociación entre Pedido y Cliente (Un cliente realiza pedidos).
    - Asociación entre Pedido y Pago (Un pedido puede tener múltiples pagos).
    - Herencia si existen subclases de Pago (Tarjeta, Efectivo, Cheque).

---

## b) Herramienta para la generación del Diagrama UML

Para generar el diagrama UML, se ha utilizado **Lucidchart**, ya que ofrece una interfaz intuitiva y colaboración en línea. Se ha comparado con **StarUML** y **Draw.io**, y la elección se ha basado en los siguientes aspectos:

- **Lucidchart:** Mayor facilidad de uso, plantillas predefinidas y colaboración en equipo.
- **StarUML:** Más orientado a desarrolladores avanzados, con soporte para código y mayor precisión técnica.
- **Draw.io:** Alternativa gratuita, pero con menos funcionalidades avanzadas.

**Conclusión:** Se eligió **Lucidchart** por su equilibrio entre funcionalidad y facilidad de uso, permitiendo generar diagramas de manera rápida y visualmente clara.

---

## c) Conversión del Diagrama UML a Código

El proceso de conversión de UML a código sigue estos pasos:

1. **Identificación de Clases y Atributos:**
    - Se crean clases en el lenguaje de programación elegido.
    - Se definen atributos con sus tipos de datos.

2. **Definición de Métodos:**
    - Se implementan métodos identificados en UML.

3. **Relaciones entre Clases:**
    - Se establecen relaciones mediante asociaciones, herencia o composición.

4. **Gestión de Estados:**
    - Se define una enumeración o constantes para manejar los estados del pedido.

5. **Persistencia de Datos:**
    - Se integra con bases de datos para almacenar la información.
