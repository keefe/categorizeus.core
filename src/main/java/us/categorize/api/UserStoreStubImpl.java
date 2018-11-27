package us.categorize.api;

import us.categorize.model.User;

public class UserStoreStubImpl implements UserStore {

	@Override
	public User getPrincipal() {
		User user = new User();
		user.setId(42);
		user.setUsername("username");
		user.setEmail("keefe@categorize.us");
		user.setPasshash("secret stuff!");
		return user;
	}

}
