    package src.main;

    public class Livro {
        int id;
        String titulo;
        String autor;
        boolean emprestado;

        public Livro(String titulo, String autor, boolean emprestado) {

            this.id = VariaveisGlobais.idLivro;
            VariaveisGlobais.idLivro += 1;

            this.titulo = titulo;
            this.autor = autor;
            this.emprestado = emprestado;

        }

        public void emprestarLivro() {

            if (getEmprestado() == false) {
                this.emprestado = true;
            }

        }

        public void retornarLivro() {
            if (getEmprestado() == true) {
                this.emprestado = false;
            }
        }


        public int getId() {
            return id;
        }

        public String getAutor() {
            return autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public boolean getEmprestado() {
            return emprestado;
        }

    }
