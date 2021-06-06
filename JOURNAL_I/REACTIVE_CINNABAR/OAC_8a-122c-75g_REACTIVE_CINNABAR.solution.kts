
solution {
    puzzle = "P056"
    name = "OA"
    arm(PISTON) {
        number = 1
        position = 1 to 1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                back()
                back()
                rotateCounterClockwise()
            }
        }
        )
    }
}
