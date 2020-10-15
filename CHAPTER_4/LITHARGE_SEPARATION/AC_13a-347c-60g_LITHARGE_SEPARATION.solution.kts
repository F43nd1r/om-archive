
solution {
    puzzle = "P031b"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 2 to -3
        rotation = 2
        size = 3
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                forward()
                grab()
                back()
                pivotClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
