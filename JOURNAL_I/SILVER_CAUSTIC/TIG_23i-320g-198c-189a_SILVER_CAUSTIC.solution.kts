
solution {
    puzzle = "P057"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = -2 to -4
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -6
        rotation = -11
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 3 to -5
        rotation = -21
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to 0
        rotation = -14
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -6 to 2
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 5
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 0 to -6
        rotation = -9
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to 2
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 5
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -4
        rotation = -15
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -2
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -2 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(28)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(32)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(34)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(27)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(25)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
