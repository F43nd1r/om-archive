
solution {
    puzzle = "P042"
    name = "OVERLAP AA"
    arm(PISTON) {
        number = 1
        position = 0 to -2
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -6
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -8
    }
    glyph(BONDER) {
        position = 4 to -4
        rotation = -3
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 4
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to -4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(2 to 0, 2 to -1, 1 to -1, 0 to 0, -1 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                extend()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                retract()
                drop()
                extend()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
