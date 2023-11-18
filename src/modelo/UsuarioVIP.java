package modelo;


import dao.PlaylistDAO;

public class UsuarioVIP extends Usuario {
	
	private PlaylistDAO playlistDAO;
	
	public UsuarioVIP(String id, String nome, String senha) {
		super(id, nome, senha);
		playlistDAO = new PlaylistDAO();
	}
	
	public void adicionar(Playlist playlist) {
		playlistDAO.adicionar(playlist);
	}
	
	public void remover(Playlist playlist) {
		playlistDAO.remover(playlist);
	}

	public PlaylistDAO getPlaylistDAO() {
		return playlistDAO;
	}

	public void setPlaylistDAO(PlaylistDAO playlistDAO) {
		this.playlistDAO = playlistDAO;
	}



}
