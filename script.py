classes = ['Circulo', 'Pessoa', 'Livro',
           'Retangulo', 'Animal', 'Produto', 'Triangulo',
           'ContaBancaria', 'Carro', 'Funcionario']

for classe in classes:
    filename = f"{classe}.java"
    
    content = f"""public class {classe} {{
    
    public static void main(String[] args) {{
        System.out.println("{classe} executado.");
    }}
}}
"""

    with open(filename, 'w') as file:
        file.write(content)