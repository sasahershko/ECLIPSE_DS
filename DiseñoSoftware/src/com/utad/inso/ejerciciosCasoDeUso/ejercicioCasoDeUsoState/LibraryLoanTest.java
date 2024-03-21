package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

public class LibraryLoanTest {
    public static void main(String[] args) {
        LoansLibrary library = new LoansLibrary(); //Singleton
        Book bookGood = new Book("Gang of four Design patterns","Gang f four", BookState.GOOD);
        
        //TODO Los docentes tienen 10 días de préstamo, los alumnos 15 días
        LibraryUser professor = new LibraryUser("MA", "miguel.mesas@u-tad.com", UserType.PROFESSOR, true);
        LibraryUser student = new LibraryUser("Inés", "ines@live.u-tad.com", UserType.STUDENT, true);

        LibraryLoanRequestContext professorLoanRequest = new LibraryLoanRequestContext(library,bookGood,professor);
        LibraryLoanRequestContext studentLoanRequest = new LibraryLoanRequestContext(library,bookGood,student);

        //La biblioteca gestiona las reservas recién creadas
        library.processLibraryLoan(studentLoanRequest);
        library.processLibraryLoan(professorLoanRequest);

        //La biblioteca gestiona la recogida del libro del docente.
        library.processLibraryLoan(professorLoanRequest);
        //La biblioteca gestiona la recogida del libro del alumno.
        library.processLibraryLoan(studentLoanRequest);

        //La biblioteca gestiona la devolución del libro del alumno.
        library.returnBook(studentLoanRequest.getBook(),studentLoanRequest);
        //La biblioteca gestiona la devolución del libro del socente.
        library.returnBook(studentLoanRequest.getBook(),professorLoanRequest);
    }
}
