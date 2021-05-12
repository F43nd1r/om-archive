
solution {
    puzzle = "P015"
    name = "OA"
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
                back()
                drop()
                back()
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
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
