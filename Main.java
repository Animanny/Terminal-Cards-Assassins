import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		boolean good = false;
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>(Arrays.asList("troops", "neck", "rod", "horn", "worth", "chain",
				"entirely", "stand", "throw", "deer", "measure", "balance", "beyond", "especially", "kids", "disease",
				"mix", "say", "bush", "supper", "blew", "accurate", "first", "kept", "hole", "example", "equal", "tell",
				"was", "native", "fence", "salt", "mind", "correct", "mission", "label", "signal", "leaving", "enemy",
				"whenever", "range", "brick", "heavy", "luck", "spread", "rule", "sick", "depend", "increase", "nuts",
				"due", "sun", "interest", "progress", "meal", "second", "complex", "hide", "willing", "pale", "word",
				"therefore", "making", "claws", "pink", "something", "within", "touch", "clear", "right", "he", "lucky",
				"captain", "worried", "breath", "camera", "tomorrow", "wealth", "broken", "sail", "great", "settlers",
				"remain", "require", "movement", "least", "hat", "pan", "prove", "brown", "labor", "want", "passage",
				"differ", "personal", "tin", "structure", "snow", "monkey", "village", "route", "them", "fair", "late",
				"west", "my", "arrange", "student", "hot", "met", "push", "shelter", "without", "firm", "western",
				"desert", "shore", "damage", "warn", "perfect", "shoulder", "present", "ready", "third", "quiet",
				"against", "community", "been", "discussion", "sentence", "steep", "hill", "plus", "plan", "may",
				"manner", "species", "giant", "depth", "saw", "gain", "including", "sign", "mad", "promised", "amount",
				"below", "won", "foreign", "exist", "officer", "bite", "manufacturing", "tired", "operation", "origin",
				"belt", "near", "answer", "occur", "pride", "solve", "three", "different", "row", "meat", "hard",
				"visit", "wide", "clean", "success", "gentle", "hang", "track", "cutting", "would", "branch", "nor",
				"four", "behind", "whispered", "drink", "vapor", "but", "also", "burn", "rocket", "rear", "tool",
				"rest", "heard", "feature", "quietly", "canal", "mother", "noted", "buy", "angle", "unknown", "distant",
				"box", "original", "newspaper", "mysterious", "vertical", "brother", "ride", "call", "snake", "circus",
				"complete", "mountain", "eventually", "come", "rose", "attack", "either", "boy", "police", "gather",
				"basic", "once", "tight", "wrapped", "fireplace", "unusual", "for", "castle", "swimming", "solid",
				"broad", "seed", "favorite", "owner", "copy", "separate", "picture", "youth", "explain", "studying",
				"board", "chart", "buried", "queen", "prevent", "now", "draw", "market", "satellites", "deep", "full",
				"alone", "instance", "inch", "before", "motor", "voice", "crop", "person", "more", "flat", "affect",
				"living", "usual", "pipe", "ranch", "breakfast", "let", "tonight", "shape", "put", "hello", "forgotten",
				"piano", "danger", "blow", "principle", "human", "drew", "indeed", "loose", "trail", "instrument",
				"remove", "buffalo", "master", "dull", "greatly", "cake", "engineer", "friend", "can", "fifty",
				"contain", "everywhere", "minerals", "continent", "thin", "into", "material", "key", "current", "rush",
				"ocean", "rather", "birthday", "development", "daughter", "topic", "ever", "money", "winter", "follow",
				"south", "cut", "cross", "half", "pair", "made", "silent", "tip", "some", "organized", "onlinetools",
				"town", "fully", "furniture", "ring", "that", "hold", "rice", "needle", "fewer", "grown", "escape",
				"paper", "ahead", "hollow", "column", "instead", "cowboy", "move", "heading", "energy", "mine",
				"positive", "short", "body", "neighbor", "sell", "heat", "step", "why", "aware", "park", "earlier",
				"interior", "hunt", "choose", "breeze", "slightly", "adult", "himself", "fairly", "which", "sang",
				"active", "sum", "learn", "high", "journey", "farther", "feed", "describe", "wolf", "higher", "chose",
				"nice", "rock", "strike", "band", "construction", "elephant", "water", "music", "meet", "anybody",
				"bright", "card", "private", "yes", "dinner", "brass", "mail", "summer", "final", "wherever", "given",
				"thousand", "act", "repeat", "composition", "six", "understanding", "swim", "thirty", "dozen", "double",
				"lift", "run", "jet", "nothing", "impossible", "comfortable", "smaller", "teach", "radio", "plenty",
				"aboard", "package", "figure", "forward", "variety", "hope", "forty", "win", "giving", "fine", "rhyme",
				"examine", "trace", "wash", "biggest", "property", "river", "image", "herd", "live", "largest", "told",
				"faster", "birds", "date", "son", "ill", "keep", "develop", "gone", "how", "fast", "finest", "hay",
				"theory", "find", "improve", "volume", "apple", "swung", "bow", "men", "cover", "spring", "sink",
				"hour", "wing", "knowledge", "question", "do", "compare", "regular", "parent", "lay", "upon", "soldier",
				"done", "women", "land", "particles", "diameter", "relationship", "lion", "silly", "continued", "stop",
				"successful", "cent", "class", "last", "as", "classroom", "then", "thrown", "taken", "best", "single",
				"sand", "young", "rays", "memory", "mark", "equally", "yourself", "bear", "excitement", "engine",
				"tone", "belong", "wool", "chicken", "cry", "doubt", "view", "have", "roof", "build", "tongue",
				"telephone", "modern", "bent", "floor", "shade", "life", "scared", "else", "slight", "scene", "forest",
				"afraid", "electric", "frozen", "whatever", "meant", "managed", "basis", "determine", "paragraph",
				"value", "jungle", "couple", "loud", "temperature", "threw", "door", "start", "pour", "research",
				"brave", "job", "test", "aside", "play", "birth", "ten", "dish", "port", "through", "identity", "to",
				"express", "science", "president", "folks", "around", "consist", "clearly", "income", "offer",
				"although", "failed", "thou", "were", "beauty", "orange", "city", "cow", "ancient", "upward", "cookies",
				"locate", "mostly", "leave", "primitive", "twelve", "today", "crew", "avoid", "yellow", "swam", "honor",
				"wall", "decide", "season", "kind", "gift", "where", "agree", "guide", "song", "mill", "planning",
				"recognize", "unhappy", "stick", "explore", "climate", "putting", "field", "related", "real", "strange",
				"aloud", "collect", "chest", "corn", "speed", "shoot", "building", "shaking", "sweet", "coat",
				"syllable", "previous", "use", "habit", "gently", "uncle", "information", "shadow", "factor",
				"division", "small", "moment", "steel", "notice", "concerned", "doll", "little", "blood", "stairs",
				"however", "harbor", "feathers", "refer", "pet", "dried", "stomach", "bus", "piece", "bet", "former",
				"sea", "substance", "statement", "hurt", "duty", "trip", "fierce", "excellent", "too", "ice", "weigh",
				"cave", "realize", "place", "degree", "exchange", "tent", "dress", "wonder", "serve", "experiment",
				"seen", "rise", "beginning", "traffic", "exact", "reader", "soil", "soft", "bag", "taught", "setting",
				"appearance", "page", "hungry", "balloon", "college", "roll", "swept", "cook", "perfectly", "title",
				"chemical", "rhythm", "health", "dirt", "farmer", "low", "slept", "paid", "thus", "hall", "tea",
				"strong", "speak", "lie", "steam", "widely", "frighten", "thick", "sit", "whale", "activity", "sing",
				"lose", "loss", "add", "beneath", "pack", "make", "language", "letter", "duck", "cap", "magic",
				"exclaimed", "down", "trade", "free", "copper", "football", "brought", "just", "load", "trick",
				"accident", "except", "highest", "each", "itself", "center", "atmosphere", "pilot", "skill", "flame",
				"know", "nearest", "sold", "sheet", "riding", "wire", "animal", "region", "this", "than", "thank",
				"universe", "family", "nose", "arrow", "angry", "nine", "triangle", "baseball", "service", "hurry",
				"factory", "basket", "strength", "education", "carried", "object", "slipped", "diagram", "flew",
				"strip", "soon", "fresh", "carefully", "step", "dead", "square", "yard", "cheese", "pictured", "slave",
				"worried", "numeral", "anyone", "grew", "phrase", "prize", "source", "dog", "friendly", "thick",
				"recent", "sides", "worker", "copy", "rear", "plain", "aboard", "brick", "crop", "thick", "steel",
				"copper", "scientific", "earlier", "crew", "animal", "forgot", "silk", "clothing", "bad", "screen",
				"steep", "gulf", "orange", "other", "adjective", "hollow", "species", "hurried", "construction", "fun",
				"cent", "shells", "everybody", "trail", "remove", "foreign", "might", "loss", "joy", "population",
				"began", "clothes", "year", "curious", "appropriate", "ago", "among", "discussion", "country", "means",
				"dog", "storm", "none", "industrial", "brief", "origin", "facing", "steel", "even", "loose", "arrive",
				"war", "fastened", "appearance", "willing", "coach", "sang", "sweet", "five", "horn", "use", "first",
				"race", "feature", "long", "zero", "constantly", "memory", "means", "feet", "bark", "purple", "glad",
				"relationship", "tongue", "nose", "religious", "balance", "should", "element", "character", "blind",
				"on", "ten", "chose", "block", "settle", "high", "excitement", "mile", "complex", "dropped", "warn",
				"stronger", "national", "boy", "opportunity", "slow", "hurt", "frighten", "school", "cent", "kind",
				"dropped", "wrote", "height", "government", "concerned", "fact", "wall", "pleasure", "zoo", "driver",
				"broad", "each", "wife", "fourth", "speed", "eager", "pipe", "case", "twelve", "selection", "native",
				"yourself", "village", "nodded", "belt", "late", "have", "put", "desk", "so", "decide", "ants", "eat",
				"thick", "mountain", "anywhere", "hat", "sudden", "habit", "potatoes", "chose", "minerals", "hunt",
				"wonder", "then", "dig", "silence", "fifty", "shoulder", "see", "needed", "plastic", "balloon", "suit",
				"explore", "section", "including", "energy", "circle", "mill", "do", "got", "manufacturing", "congress",
				"section", "physical", "herself", "lot", "plural", "musical", "people", "yard", "sell", "rod", "cattle",
				"trail", "remarkable", "there", "sound", "whom", "knowledge", "egg", "forth", "plural", "job", "to",
				"whatever", "recent", "cause", "leg", "require", "pleasant", "entirely", "bring", "here", "purpose",
				"fat", "older", "anyway", "garden", "pet", "camp", "cave", "nearer", "policeman", "cat", "instance",
				"about", "realize", "dried", "mind", "strip", "maybe", "hill", "mice", "bottom", "spend", "way", "blow",
				"walk", "continued", "steel", "drawn", "clothes", "mad", "fix", "national", "identity", "answer",
				"over", "which", "line", "term", "air", "egg", "obtain", "social", "water", "needs", "struck", "exact",
				"solid", "met", "been", "hello", "call", "heat", "twenty", "private", "number", "twenty", "grew",
				"crowd", "cow", "row", "potatoes", "into", "newspaper", "calm", "pool", "brief", "dropped", "now",
				"instance", "sport", "section", "both", "poet", "program", "time", "fill", "doubt", "interior", "poor",
				"ranch", "bat", "driving", "example", "white", "attached", "seldom", "quarter", "itself", "drop", "sit",
				"speed", "form", "failed", "regular", "spend", "combine", "pie", "beginning", "queen", "only", "bring",
				"additional", "anyway", "until", "chair", "whether", "age", "finally", "hidden", "repeat", "respect",
				"syllable", "pour", "climate", "production", "broken", "ahead", "influence", "river", "warn", "air",
				"diameter", "club", "means", "per", "enemy", "perfectly", "member", "such", "bone", "well", "due",
				"shop", "natural", "farther", "ground", "ought", "basis", "nervous", "accept", "moon", "cast", "heard",
				"gentle", "baby", "stage", "opportunity", "try", "coach", "army", "sad", "policeman", "ill", "fewer",
				"although", "bean", "street", "island", "send", "sand", "captured", "crack", "higher", "nodded",
				"alone", "allow", "selection", "there", "shells", "dream", "easy", "rule", "cowboy", "setting", "in",
				"either", "getting", "team", "tin", "pack", "fair", "surrounded", "special", "bright", "bar", "path",
				"three", "quick", "of", "uncle", "needs", "saddle", "little", "attempt", "chart", "negative",
				"floating", "tribe", "if", "goose", "mood", "native", "watch", "war", "kids", "shoe", "middle",
				"opportunity", "badly", "breathe", "dollar", "easy", "canal", "whom", "thumb", "mill", "somehow",
				"stream", "drew", "bark", "nearly", "although", "hunter", "stove", "flight", "event", "huge", "stream",
				"driven", "stretch", "meet", "pie", "work", "early", "pine", "dangerous", "slide", "everyone", "three",
				"chose", "would", "receive", "compound", "around", "mouth", "dollar", "agree", "stone", "pass", "use",
				"whether", "battle", "missing", "prize", "notice", "action", "higher", "nobody", "contain", "till",
				"football", "darkness", "strong", "necessary", "flower", "floating", "depend", "clock", "doll", "teach",
				"back", "old", "whether", "own", "barn", "jungle", "colony", "chose", "spent", "necessary", "pull",
				"shells", "energy", "direct", "western", "fence", "want", "am", "cloud", "double", "rhyme", "sat",
				"tape", "list", "balance", "receive", "unusual", "present", "gravity", "cry", "hard", "rabbit", "skin",
				"remove", "national", "handle", "wire", "shout", "deep", "keep", "two", "jack", "house", "include",
				"race", "rear", "pictured", "write", "potatoes", "yellow", "branch", "show", "belong", "browserling",
				"sink", "chapter", "national", "sheep", "nearly", "saw", "alike", "handle", "worth", "shorter", "party",
				"gray", "alone", "grown", "kitchen", "army", "changing", "wing", "here", "shallow", "nearer", "all",
				"good", "education", "television", "mine", "swimming", "concerned", "combine", "most", "smaller",
				"even", "one", "ear", "instrument", "aloud", "sent", "shirt", "needed", "chose", "tune", "my", "before",
				"lips", "gone", "swam", "forgotten", "was", "growth", "our", "pilot", "about", "shirt", "complex",
				"surprise", "describe", "house", "audience", "dollar", "huge", "fly", "missing", "research", "rabbit",
				"including", "common", "here", "select", "supper", "degree", "widely", "stage", "fifty", "while",
				"create", "shirt", "beginning", "clear", "vessels", "willing", "speech", "second", "saved", "source",
				"myself", "against", "boy", "lonely", "safety", "hope", "program", "whale", "coat", "load", "sister",
				"forget", "influence", "tax", "far", "hide", "riding", "pond", "ride", "differ", "straw", "eager",
				"oldest", "deep", "aloud", "should", "garage", "news", "giant", "manner", "job", "joy", "physical",
				"scientist", "north", "brass", "native", "total", "manner", "cream", "sign", "curve", "trip", "top",
				"industry", "winter", "determine", "has", "giant", "labor", "forth", "want", "worker", "truck",
				"eventually", "official", "lovely", "fear", "news", "smoke", "main", "bat", "exact", "share", "season",
				"alphabet", "guess", "snow", "else", "kept", "out", "respect", "powder", "lying", "success", "seed",
				"magnet", "now", "observe", "ordinary", "television", "shoulder", "complete", "put", "although",
				"country", "forward", "winter", "program", "block", "twenty", "vertical", "cold", "house", "difficult",
				"take", "how", "song", "curious", "thrown", "fewer", "brother", "word", "experience", "mean", "highway",
				"busy", "kind", "simple", "bet", "vowel", "street", "certainly", "only", "current", "against",
				"direction", "being", "fierce", "chose", "won", "usual", "having", "slope", "breath", "face", "horn",
				"studying", "nuts", "factor", "nor", "sold", "hollow", "rising", "ourselves", "poem", "depth", "worth",
				"swung", "become", "fighting", "helpful", "animal", "feathers", "coming", "social"));

		Scanner sc = new Scanner(System.in);
		System.out.println("How many players? ");
		int numPlayers = 0;
		boolean check = false;
		while (!check) {
			try {
				numPlayers = sc.nextInt();
				check = true;
			} catch (InputMismatchException e) {
				System.out.println("That's not a number fuckhead");
				
			}
		}
		
		ArrayList<Player> players = new ArrayList<Player>();

		for (int i = 1; i <= numPlayers; i++) {
			System.out.println("Player " + i + "'s Name: ");
			String name = sc.next();
			Player player = new Player(name);
			players.add(player);
		}
		ArrayList<Player> targets = new ArrayList<>(players);

		for (int i = 0; i < numPlayers; i++) {
			for (int j = 0; j < 3; j++) {
				int randomNum = ThreadLocalRandom.current().nextInt(0, words.size() - 1);
				players.get(i).targetWords.add(words.get(randomNum));
				words.remove(randomNum);
			}
		}

		Collections.shuffle(targets);
		while (!good) {
			Collections.shuffle(targets);
			good = true;
			for (int i = 0; i < players.size(); i++) {
				if (players.get(i) == targets.get(i)) {
					good = false;
				}
			}
		}
		for (int i = 0; i < numPlayers; i++) {
			players.get(i).setTarget(targets.get(i).getName());
		}

		for (int i = 0; i < players.size(); i++) {
			for (int clear = 0; clear < 1000; clear++) {
				System.out.println("\b");
			}
			System.out.println("Puff Puff Pass. Press Enter to continue");
			try {
				System.in.read();
			} catch (Exception e) {
			}

			System.out.println("Hello Player: " + players.get(i).getName());
			System.out.println("-----------------------------");
			System.out.println("Your target is " + players.get(i).getTarget());
			System.out.println("Get them to say:");
			for (int j = 0; j < 3; j++) {
				System.out.println(players.get(i).targetWords.get(j));
			}
			System.out.println("Press Enter to continue");
			try {
				System.in.read();
			} catch (Exception e) {
			}
		}

	}

}
