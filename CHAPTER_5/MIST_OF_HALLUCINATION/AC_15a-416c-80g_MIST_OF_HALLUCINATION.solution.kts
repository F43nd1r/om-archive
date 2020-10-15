
solution {
    puzzle = "P038"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = -2 to -1
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -3 to 1
        rotation = -16
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 2
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(0 to -1, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                retract()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                retract()
                rotateClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                extend()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                extend()
                grab()
                forward()
                drop()
                retract()
                back()
                grab()
                forward()
                back()
                reset()
            }
        }
        )
    }
}
