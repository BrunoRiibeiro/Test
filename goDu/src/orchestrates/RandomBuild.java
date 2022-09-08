package orchestrates;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import model.Accommodation;
import model.Group;
import model.Restaurant;
import model.Transportation;
import model.User;
import model.database.DatabaseProvider;

public class RandomBuild {

	public void RandomBuilder() {

		User igor = new User("Igor", randDate(1500, 2004));
		User bruno = new User("Bruno", randDate(1500, 2004));
		User leok = new User("Leo K", randDate(1500, 2004));
		User isabelle = new User("Isabelle", randDate(1500, 2004));
		User bia = new User("Beatriz", randDate(1500, 2004));

		DatabaseProvider.getUsers().add(igor);
		DatabaseProvider.getUsers().add(bruno);
		DatabaseProvider.getUsers().add(leok);
		DatabaseProvider.getUsers().add(isabelle);
		DatabaseProvider.getUsers().add(bia);

		Group amgIgor = new Group("Amigos do Igor", igor, "Viagem com os amigos", randDate(2023, 2123));
		amgIgor.setNumberOfMembers(5);
		amgIgor.setTotalPrice(6094.43);

		Group amgBruno = new Group("Amigos do Bruno", bruno, "Viagem em casal", randDate(2023, 2123));
		amgBruno.setNumberOfMembers(2);
		amgBruno.setTotalPrice(612.07);

		Group amgLeo = new Group("Amigos do Leo", leok, "Baguncinha do Leo", randDate(2023, 2123));
		amgLeo.setNumberOfMembers(8);
		amgLeo.setTotalPrice(1794.6);

		Group amgIsa = new Group("Amigos do Isabelle", isabelle, "Viagem em familia", randDate(2023, 2123));
		amgIsa.setNumberOfMembers(10);
		amgIsa.setTotalPrice(6094.43);

		Group amgBia = new Group("Amigos do Beatriz", bia, "Desvendar o Brasil", randDate(2023, 2123));
		amgBia.setNumberOfMembers(1);
		amgBia.setTotalPrice(285.94);

		Accommodation hotel = new Accommodation(randDate(2023, 2123), "Rio de Janeiro", "Hotel", 5678.99);
		Accommodation motel = new Accommodation(randDate(2023, 2123), "São Paulo", "Motel", 342.50);
		Accommodation aluguel = new Accommodation(randDate(2023, 2123), "Belo Horizonte", "airbnb", 1657.90);
		Accommodation parente = new Accommodation(randDate(2023, 2123), "Brasilia", "Casa da minha tia Judette", 0.00);

		List<Accommodation> AccomodationIgor = amgIgor.getAccommodation();
		AccomodationIgor.add(hotel);
		amgIgor.setAccommodation(AccomodationIgor);

		List<Accommodation> AccomodationBruno = amgBruno.getAccommodation();
		AccomodationBruno.add(motel);
		amgBruno.setAccommodation(AccomodationBruno);

		List<Accommodation> AccomodationLeo = amgLeo.getAccommodation();
		AccomodationLeo.add(aluguel);
		amgLeo.setAccommodation(AccomodationLeo);

		List<Accommodation> AccomodationIsa = amgIsa.getAccommodation();
		AccomodationIsa.add(hotel);
		amgIsa.setAccommodation(AccomodationIsa);

		List<Accommodation> AccomodationBia = amgBia.getAccommodation();
		AccomodationBia.add(parente);
		amgBia.setAccommodation(AccomodationBia);

		Restaurant copa = new Restaurant(randDate(2023, 2123), "Rio de Janeiro", "Copacabana Palace", 5, "File Mignon",
				367.84);
		Restaurant paris = new Restaurant(randDate(2023, 2123), "São Paulo", "Paris6", 5, "Risoto", 236.77);
		Restaurant rioBistro = new Restaurant(randDate(2023, 2123), "Belo Horizonte", "Rio Bistrô", 4,
				"Bobo de camarão", 86.90);
		Restaurant benedito = new Restaurant(randDate(2023, 2123), "Brasilia", "Benedito", 3, "Hamburguer", 238.34);

		List<Restaurant> restaurantIgor = amgIgor.getRestaurant();
		restaurantIgor.add(copa);
		amgIgor.setRestaurant(restaurantIgor);

		List<Restaurant> restaurantBruno = amgBruno.getRestaurant();
		restaurantBruno.add(paris);
		amgBruno.setRestaurant(restaurantBruno);

		List<Restaurant> restaurantLeo = amgLeo.getRestaurant();
		restaurantLeo.add(rioBistro);
		amgLeo.setRestaurant(restaurantLeo);

		List<Restaurant> restaurantIsa = amgIsa.getRestaurant();
		restaurantIsa.add(copa);
		amgIsa.setRestaurant(restaurantIsa);

		List<Restaurant> restaurantBia = amgBia.getRestaurant();
		restaurantBia.add(benedito);
		amgBia.setRestaurant(restaurantBia);

		Transportation bonde = new Transportation(randDate(2023, 2123), "Cristo Redentor", "bonde", 47.60);
		Transportation aviao = new Transportation(randDate(2023, 2123), "Aeroporto de São Paulo", "aviao", 32.80);
		Transportation carro = new Transportation(randDate(2023, 2123), "Festa na casa de amigos", "carro", 49.80);
		Transportation uber = new Transportation(randDate(2023, 2123), "Na praia", "Uber", 47.60);

		List<Transportation> transportationIgor = amgIgor.getTransportation();
		transportationIgor.add(bonde);
		amgIgor.setTransportation(transportationIgor);

		List<Transportation> transportationBruno = amgBruno.getTransportation();
		transportationBruno.add(aviao);
		amgBruno.setTransportation(transportationBruno);

		List<Transportation> transportationLeo = amgLeo.getTransportation();
		transportationLeo.add(carro);
		amgLeo.setTransportation(transportationLeo);

		List<Transportation> transportationIsa = amgIsa.getTransportation();
		transportationIsa.add(bonde);
		amgIsa.setTransportation(transportationIsa);

		List<Transportation> transportationBia = amgBia.getTransportation();
		transportationBia.add(uber);
		amgBia.setTransportation(transportationBia);

		DatabaseProvider.getGroups().add(amgIgor);
		DatabaseProvider.getGroups().add(amgBruno);
		DatabaseProvider.getGroups().add(amgLeo);
		DatabaseProvider.getGroups().add(amgIsa);
		DatabaseProvider.getGroups().add(amgBia);

	}

	public int randBetween(int start, int stop) {
		return start + (int) Math.round(Math.random() * (stop - start));
	}

	public String randDate(int start, int stop) {

		GregorianCalendar gc = new GregorianCalendar();

		int year = randBetween(start, stop);

		gc.set(Calendar.YEAR, year);

		int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));

		gc.set(Calendar.DAY_OF_YEAR, dayOfYear);

		return gc.get(Calendar.DAY_OF_MONTH) + "/" + (gc.get(Calendar.MONTH) + 1) + "/" + gc.get(Calendar.YEAR);
	}

}
