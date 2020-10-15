
solution {
    puzzle = "P034"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = -4 to 0
        rotation = -1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -3 to 0
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = -4 to 2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -5 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to 1
        rotation = 0
    }
    track {
        position = -4 to 1
        positions = listOf(-1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                extend()
                retract()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                extend()
                extend()
                grab()
                back()
                drop()
                retract()
                retract()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                forward()
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                extend()
                retract()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                extend()
                retract()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                extend()
                extend()
                drop()
                retract()
                retract()
                reset()
            }
        }
        )
    }
}
