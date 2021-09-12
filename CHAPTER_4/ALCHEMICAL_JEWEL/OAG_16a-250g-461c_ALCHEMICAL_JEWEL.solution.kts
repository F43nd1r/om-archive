
solution {
    puzzle = "P035"
    name = "OAG (Copy)"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -7
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = -5
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = -6
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -12
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -4
        rotation = 0
    }
    track {
        position = -1 to -3
        positions = listOf(0 to 0, -1 to 1, -1 to 2, 0 to 2, 0 to 1, 1 to 0)
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
                back()
                back()
                back()
                back()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                reset()
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
