
solution {
    puzzle = "P024"
    name = "B AG"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 3 to -3
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -1
        rotation = 4
        size = 3
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 2 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 4 to -3
        rotation = 0
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 0 to 0
        positions = listOf(1 to -1, 1 to 0, 2 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                back()
                drop()
                retract()
                retract()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                forward()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                forward()
                forward()
                drop()
                back()
                retract()
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                extend()
                back()
                drop()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(21)
                back()
                wait(6)
                forward()
                wait(4)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                reset()
            }
        }
        )
    }
}
