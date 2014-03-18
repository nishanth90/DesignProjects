package com.lib.wrappers;



	
	
	

	import java.util.ArrayList;
	import java.util.List;

	import com.lib.DomainObjects.Books;
	import com.lib.DomainObjects.Magzines;
	import com.lib.DomainObjects.VCD;

	public class ResponseWrapper {

		
		
		List<Books> books = new ArrayList<>();
		public List<Books> getBooks() {
			return books;
		}
		public void setBooks(List<Books> books) {
			this.books = books;
		}
		public List<Magzines> getMagzines() {
			return magzines;
		}
		public void setMagzines(List<Magzines> magzines) {
			this.magzines = magzines;
		}
		public List<VCD> getVcds() {
			return vcds;
		}
		public void setVcds(List<VCD> vcds) {
			this.vcds = vcds;
		}
		List<Magzines> magzines = new ArrayList<>();
		List<VCD> vcds = new ArrayList<>();
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			StringBuilder builder = new StringBuilder();
			if(books.size() != 0)
			{
				for(Books book: books)
				{
					builder.append(book.getAuthor());
					builder.append(book.getISBN());
				}
				return builder.toString();
			}
			
			return super.toString();
			
		}
		
	}

	  


