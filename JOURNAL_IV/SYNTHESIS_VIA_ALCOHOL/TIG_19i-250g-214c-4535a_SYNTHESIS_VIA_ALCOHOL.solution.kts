
solution {
    puzzle = "P071"
    name = "NEW SOLUTION 2 (Copy)"
    arm(ARM6) {
        number = 1
        position = -12 to -4
        rotation = -1
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -12 to -1
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -9 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -10 to -2
        rotation = 1
        size = 2
    }
    arm(ARM2) {
        number = 5
        position = -7 to -4
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -11 to -3
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -15 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = -9 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -13 to -6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -11 to -2
        rotation = -1
    }
    glyph(UNIFICATION) {
        position = -8 to -3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -15 to -1
        rotation = -4
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
            sequence(2) {
                wait(4)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                extend()
                reset()
                wait(1)
                extendTape()
            }
        }
        )
    }
}
