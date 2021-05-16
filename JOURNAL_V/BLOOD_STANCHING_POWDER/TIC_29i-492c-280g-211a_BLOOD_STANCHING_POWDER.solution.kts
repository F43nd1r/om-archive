
solution {
    puzzle = "P087"
    name = "TI 29"
    arm(ARM6) {
        number = 1
        position = -9 to -5
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -9 to -2
        rotation = 1
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -4 to -2
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = -3 to -2
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 1 to -8
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = -2 to -3
        rotation = 4
        size = 3
    }
    arm(ARM3) {
        number = 7
        position = -2 to 5
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -9 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -10 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to 4
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -6
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = -11 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -8 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 2 to -9
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -8 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(13)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(10)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
