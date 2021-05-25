
solution {
    puzzle = "P035"
    name = "OVERLAP AA"
    arm(PISTON) {
        number = 1
        position = -3 to -1
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 4
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 2
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -2, 1 to -2, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                back()
                drop()
                back()
                back()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                back()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
