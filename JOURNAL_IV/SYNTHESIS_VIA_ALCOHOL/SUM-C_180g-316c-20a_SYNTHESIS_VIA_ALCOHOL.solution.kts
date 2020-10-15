
solution {
    puzzle = "P071"
    name = "B AA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -3 to 1
        rotation = 5
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 2 to 0
        rotation = 2
        size = 1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 1 to -2
        rotation = -6
    }
    glyph(UNIFICATION) {
        position = 0 to 1
        rotation = -8
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = -10
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(14)
                back()
                wait(24)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                forward()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                wait(1)
                extend()
                drop()
                retract()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                extend()
                wait(6)
                grab()
                retract()
                retract()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(14)
                back()
                extend()
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
