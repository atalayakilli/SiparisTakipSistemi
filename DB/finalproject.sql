-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 15 Ağu 2018, 11:53:48
-- Sunucu sürümü: 10.1.31-MariaDB
-- PHP Sürümü: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `finalproject`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `admins`
--

CREATE TABLE `admins` (
  `fid` int(11) NOT NULL,
  `fisim` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `fsoyisim` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `fadmin` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `fpassword` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `admins`
--

INSERT INTO `admins` (`fid`, `fisim`, `fsoyisim`, `fadmin`, `fpassword`) VALUES
(1, 'Atalay', 'Akıllı', 'atalayakilli@gmail.com', '1234'),
(3, 'atalay', 'akıllı', 'atalay3akilli@gmail.com', '12'),
(4, 'ali', 'bilmem', 'alibilmem@gmail.com', '123456'),
(5, 'Ali', 'Bilirim', 'alibilirim@gmail.com', '12345'),
(6, 'atalay', 'akıllı', 'a@a.com', '1234'),
(7, 'yiğit', 'canlı', 'yigitcanli@gmai.com', '123'),
(9, 'atalay', 'akıllı', 'atalay5akilli@gmail.com', '12345'),
(10, 'ali', 'bilirim', 'asd@asd.com', '12345'),
(11, 'atalay', 'akıllı', '.@', '12345'),
(12, 'atalay', 'akıllı', 'a.@', '12345');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `siparisler`
--

CREATE TABLE `siparisler` (
  `sid` int(11) NOT NULL,
  `sadi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `ssoyadi` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `surun` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `sadet` int(11) NOT NULL,
  `durum` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `siparisler`
--

INSERT INTO `siparisler` (`sid`, `sadi`, `ssoyadi`, `surun`, `sadet`, `durum`) VALUES
(1, 'atalay', 'akıllı', 'dürüm', 2, 'Tamamlandı'),
(2, 'atalay', 'akıllı', 'hamburger', 3, 'Tamamlandı'),
(3, 'atalay', 'akıllı', 'künefe', 6, 'Tamamlandı'),
(4, 'atalay', 'akıllı', 'tost', 3, 'Tamamlandı'),
(5, 'atalay', 'akıllı', 'künefe', 5, 'Tamamlandı'),
(6, 'ali', 'bilirim', 'elma', 5, 'Tamamlandı'),
(7, 'atalay', 'akıllı', 'içki', 6, 'Tamamlandı'),
(8, 'atalay', 'akıllı', 'ilik', 5, 'Tamamlandı'),
(9, 'asd', 'afsaf', 'asfas', 12, 'Tamamlandı'),
(10, 'asdasd', 'asdasd', 'asd', 12, 'Tamamlandı'),
(11, 'atalay', 'akıllı', 'dürüm', 89, 'Tamamlandı'),
(12, 'asd', 'asd', 'asd', 12, 'Tamamlandı'),
(13, 'asd', 'asd', 'asd', 12123, 'Tamamlandı'),
(14, 'atalay', 'akıllı', 'dürüm', 123, 'Tamamlandı'),
(15, 'atalay', 'akıllı', 'salatalık', 2, 'Tamamlandı'),
(16, 'atalay', 'akıllı', 'dürüm', 5, 'Tamamlandı'),
(17, 'atalay', 'akıllı', 'salata', 1, 'Tamamlandı'),
(18, 'atalay', 'akıllı', 'salata', 2, 'Tamamlandı'),
(19, 'atalay', 'akıllı', 'salata', 2, 'Tamamlandı');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`fid`);

--
-- Tablo için indeksler `siparisler`
--
ALTER TABLE `siparisler`
  ADD PRIMARY KEY (`sid`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `admins`
--
ALTER TABLE `admins`
  MODIFY `fid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Tablo için AUTO_INCREMENT değeri `siparisler`
--
ALTER TABLE `siparisler`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
