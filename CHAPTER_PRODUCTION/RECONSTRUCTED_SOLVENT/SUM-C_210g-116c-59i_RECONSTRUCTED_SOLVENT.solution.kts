
solution {
    puzzle = "P084"
    name = "B S"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 5 to 5
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 8 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 5 to 2
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 7 to 6
        rotation = 4
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 8 to 4
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 9 to 4
        rotation = 2
    }
    glyph(BONDER) {
        position = 7 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 6 to 5
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 8 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 7 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 9 to 0
        rotation = 0
    }
    track {
        position = 5 to 3
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                wait(2)
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        )
    }
}
