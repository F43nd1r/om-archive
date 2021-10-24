
solution {
    puzzle = "P087"
    name = "NEW SOLUTION 2"
    arm(ARM2) {
        number = 1
        position = -9 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -8 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -12 to 6
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -7 to 5
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -7 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -7 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 5
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -8 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
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
            sequence(3) {
                wait(5)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
