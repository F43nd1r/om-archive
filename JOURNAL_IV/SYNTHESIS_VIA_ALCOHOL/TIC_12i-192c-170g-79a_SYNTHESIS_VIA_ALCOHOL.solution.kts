
solution {
    puzzle = "P071"
    name = "TI"
    arm(ARM1) {
        number = 1
        position = 4 to -4
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 1 to 1
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = -2 to 3
        rotation = -3
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = 3 to 1
        rotation = -6
        size = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 2
        rotation = -1
    }
    glyph(UNIFICATION) {
        position = 3 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -3
        rotation = -2
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
