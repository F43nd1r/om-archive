
solution {
    puzzle = "P069"
    name = "NEW SOLUTION 6 (Copy)"
    arm(ARM1) {
        number = 1
        position = -22 to -8
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -19 to -9
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -21 to -6
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -24 to -5
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -26 to -4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -28 to -6
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -26 to -9
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -28 to -5
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -25 to -6
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -23 to -5
        rotation = 0
    }
    glyph(BONDER) {
        position = -27 to -8
        rotation = -4
    }
    glyph(BONDER) {
        position = -26 to -5
        rotation = -3
    }
    glyph(BONDER) {
        position = -22 to -9
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -22 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -29 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -28 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -19 to -11
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -22 to -7
        rotation = 2
    }
    glyph(DISPERSION) {
        position = -26 to -7
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -23 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -17 to -9
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -30 to -3
        rotation = -1
    }
    io(OUTPUT) {
        index = 2
        position = -20 to -5
        rotation = -2
    }
    io(OUTPUT) {
        index = 3
        position = -29 to -5
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
