
solution {
    puzzle = "P071"
    name = "B TI15 1-6T"
    arm(ARM6) {
        number = 1
        position = -1 to 2
        rotation = 0
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -1 to 4
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 3
        rotation = -1
        size = 2
    }
    arm(ARM2) {
        number = 5
        position = 4 to 1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 0 to 3
        rotation = -1
    }
    glyph(UNIFICATION) {
        position = 3 to 2
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 2
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
