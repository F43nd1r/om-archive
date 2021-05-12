
solution {
    puzzle = "P015"
    name = "OA (Copy)"
    arm(PISTON) {
        number = 1
        position = -1 to 2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 0 to 2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -2 to 3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 3
        rotation = 0
    }
    track {
        position = 0 to 2
        positions = listOf(-1 to 0, 0 to -1, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
