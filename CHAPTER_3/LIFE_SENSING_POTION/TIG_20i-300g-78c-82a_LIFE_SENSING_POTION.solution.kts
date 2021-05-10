
solution {
    puzzle = "P030b"
    name = "INSTRUCTIONS NO TRACK 8"
    arm(ARM6) {
        number = 1
        position = -9 to 3
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -6 to 2
        rotation = -3
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -9 to 6
        rotation = -4
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = -4 to 1
        rotation = -4
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -4 to 2
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -6 to 3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -9 to 5
        rotation = -2
    }
    glyph(BONDER) {
        position = -7 to 6
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 5
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -7 to 4
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -9 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -10 to 6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -8 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -10 to 7
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                retract()
                drop()
                extend()
            }
        }
        )
    }
}
