
solution {
    puzzle = "P008"
    name = "B CI39"
    arm(ARM1) {
        number = 1
        position = -5 to 4
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -3 to 4
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to -1
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -4 to 1
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = -1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 6 to -4
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 7
        position = 7 to -3
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 8
        position = 6 to 0
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 9
        position = 5 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 6 to -3
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 11
        position = 4 to -4
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 5 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 6 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 0
        rotation = 0
    }
    track {
        position = 7 to -5
        positions = listOf(0 to 0, -1 to 1, -1 to 0, 0 to -1)
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                reset()
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
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                back()
                reset()
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
            sequence(8) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
