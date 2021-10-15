
solution {
    puzzle = "P071"
    name = "NEW SOLUTION 4"
    arm(ARM1) {
        number = 1
        position = 0 to -4
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 4 to -3
        rotation = -1
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = 5 to -2
        rotation = 4
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to -2
        rotation = 2
    }
    glyph(UNIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                rotateCounterClockwise()
            }
        }
        )
    }
}
