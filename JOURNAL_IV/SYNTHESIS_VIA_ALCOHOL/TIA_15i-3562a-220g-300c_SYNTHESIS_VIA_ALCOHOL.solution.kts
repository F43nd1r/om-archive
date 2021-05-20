
solution {
    puzzle = "P071"
    name = "NEW SOLUTION 2"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -14 to -5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -14 to -7
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -11 to -8
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -9 to -8
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -9 to -6
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -14 to -10
        rotation = 0
    }
    glyph(BONDER) {
        position = -10 to -9
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -12 to -9
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -13 to -6
        rotation = -1
    }
    glyph(UNIFICATION) {
        position = -10 to -7
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -17 to -7
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -9
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                rotateClockwise()
            }
        }
        , 
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
            sequence(4) {
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
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
