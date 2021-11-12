
solution {
    puzzle = "P084"
    name = "NEW SOLUTION 1 (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = 8 to 4
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 5 to 5
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 5 to 3
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 7 to 0
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 6 to 6
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 7 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 8 to 5
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = 6 to 5
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 6 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 7 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to 2
        rotation = 0
    }
    track {
        position = 9 to 3
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                extend()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(12)
                extend()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                back()
                drop()
                forward()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(20)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                rotateCounterClockwise()
                wait(11)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
