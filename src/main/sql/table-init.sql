 CREATE TABLE  `bars` (
  `numeroBar` INT NOT NULL AUTO_INCREMENT,
  `nomBar` TEXT NOT NULL,
  `descriptionBar` TEXT NOT NULL,
  `jourOuverture` TEXT,
  `horaireOuv` TIME,
  `horaireFermeture` TIME,
  `quartierBar` TEXT NOT NULL,
  `styleBar` TEXT NOT NULL,
  `imgBar` TEXT NOT NULL,
  PRIMARY KEY (`numeroBar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8; 
    
	
CREATE TABLE  `quartiers` (
  `numeroQuartier` INT NOT NULL AUTO_INCREMENT,
  `nomQuartier` TEXT NOT NULL,
  `descriptionQuartier` TEXT NOT NULL,
  `imgQuartier` TEXT NOT NULL,
  PRIMARY KEY (`numeroQuartier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;