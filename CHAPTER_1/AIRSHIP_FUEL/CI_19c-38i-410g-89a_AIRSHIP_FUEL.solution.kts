
solution {
    puzzle = "P008"
    name = "B CI38"
    arm(ARM3) {
        number = 1
        position = 4 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to 1
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = 2 to 0
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = 1 to -2
        rotation = 6
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 3 to -3
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = -1 to -3
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 7
        position = -4 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -1 to -4
        rotation = 9
        size = 2
    }
    arm(ARM6) {
        number = 9
        position = -4 to -3
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 10
        position = 0 to -4
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 3 to -5
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 4
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -5
        rotation = 0
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
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
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
