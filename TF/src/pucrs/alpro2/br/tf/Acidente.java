package pucrs.alpro2.br.tf;

public class Acidente {
	private String local;
	private String tipoAcid;
	private String dataHora;
	private String diaSem;
	private int feridos;
	private int mortes;
	private int mortesPost;
	private int fatais;
	private int auto;
	private int taxi;
	private int lotacao;
	private int onibusUrb;
	private int onibusInt;
	private int caminhao;
	private int carroca;
	private int bicicleta;
	private String tempo;
	private String noiteDia;
	private String regiao;
	
	public Acidente(String local, String tipoAcid, String dataHora,
			String diaSem, int feridos, int mortes, int mortesPost, int fatais,
			int auto, int taxi, int lotacao, int onibusUrb, int onibusInt,
			int caminhao, int carroca, int bicicleta, String tempo,
			String noiteDia, String regiao) {
		super();
		this.local = local;
		this.tipoAcid = tipoAcid;
		this.dataHora = dataHora;
		this.diaSem = diaSem;
		this.feridos = feridos;
		this.mortes = mortes;
		this.mortesPost = mortesPost;
		this.fatais = fatais;
		this.auto = auto;
		this.taxi = taxi;
		this.lotacao = lotacao;
		this.onibusUrb = onibusUrb;
		this.onibusInt = onibusInt;
		this.caminhao = caminhao;
		this.carroca = carroca;
		this.bicicleta = bicicleta;
		this.tempo = tempo;
		this.noiteDia = noiteDia;
		this.regiao = regiao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipoAcid() {
		return tipoAcid;
	}

	public void setTipoAcid(String tipoAcid) {
		this.tipoAcid = tipoAcid;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getDiaSem() {
		return diaSem;
	}

	public void setDiaSem(String diaSem) {
		this.diaSem = diaSem;
	}

	public int getFeridos() {
		return feridos;
	}

	public void setFeridos(int feridos) {
		this.feridos = feridos;
	}

	public int getMortes() {
		return mortes;
	}

	public void setMortes(int mortes) {
		this.mortes = mortes;
	}

	public int getMortesPost() {
		return mortesPost;
	}

	public void setMortesPost(int mortesPost) {
		this.mortesPost = mortesPost;
	}

	public int getFatais() {
		return fatais;
	}

	public void setFatais(int fatais) {
		this.fatais = fatais;
	}

	public int getAuto() {
		return auto;
	}

	public void setAuto(int auto) {
		this.auto = auto;
	}

	public int getTaxi() {
		return taxi;
	}

	public void setTaxi(int taxi) {
		this.taxi = taxi;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}

	public int getOnibusUrb() {
		return onibusUrb;
	}

	public void setOnibusUrb(int onibusUrb) {
		this.onibusUrb = onibusUrb;
	}

	public int getOnibusInt() {
		return onibusInt;
	}

	public void setOnibusInt(int onibusInt) {
		this.onibusInt = onibusInt;
	}

	public int getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(int caminhao) {
		this.caminhao = caminhao;
	}

	public int getCarroca() {
		return carroca;
	}

	public void setCarroca(int carroca) {
		this.carroca = carroca;
	}

	public int getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(int bicicleta) {
		this.bicicleta = bicicleta;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getNoiteDia() {
		return noiteDia;
	}

	public void setNoiteDia(String noiteDia) {
		this.noiteDia = noiteDia;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	

}
