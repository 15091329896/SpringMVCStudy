package controller.TestFileupload.bean;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MultiFileDomain {
	private List<String> description;
	private List<MultipartFile> myfile;

	public MultiFileDomain() {
		super();
	}

	/**
	 * @return the description
	 */
	public List<String> getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(List<String> description) {
		this.description = description;
	}

	/**
	 * @return the myfile
	 */
	public List<MultipartFile> getMyfile() {
		return myfile;
	}

	/**
	 * @param myfile the myfile to set
	 */
	public void setMyfile(List<MultipartFile> myfile) {
		this.myfile = myfile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MultiFileDomain [description=" + description + ", myfile=" + myfile + "]";
	}

}