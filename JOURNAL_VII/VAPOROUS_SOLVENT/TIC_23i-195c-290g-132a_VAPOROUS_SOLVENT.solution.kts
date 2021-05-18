
solution {
    puzzle = "P098"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -6 to 4
        rotation = 6
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -5 to 2
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -2 to -1
        rotation = 7
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = -7 to -1
        rotation = 5
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = -4 to 0
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -5 to -1
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 1 to 2
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -6 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -6 to 5
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -5 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -5 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(19)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(17)
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(15)
                grab()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(7) {
                wait(22)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
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
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
