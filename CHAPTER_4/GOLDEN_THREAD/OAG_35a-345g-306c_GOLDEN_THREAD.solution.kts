
solution {
    puzzle = "P037"
    name = "OVERLAP AG"
    arm(ARM1) {
        number = 1
        position = 4 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to 1
        rotation = 4
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -7 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to -1
        rotation = 0
    }
    track {
        position = 4 to 0
        positions = listOf(-6 to -1, -5 to -1, -4 to -1, -3 to -1, -2 to -1, -1 to -1, 0 to -1, 0 to 0, -1 to 0, -2 to 1, -3 to 1, -4 to 1, -5 to 1, -6 to 1, -7 to 1, -8 to 1, -9 to 1, -10 to 1, -10 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                back()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                forward()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                wait(15)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(257)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                forward()
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                back()
                grab()
                pivotCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                pivotClockwise()
                drop()
                forward()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                pivotClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                rotateClockwise()
                back()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
            }
        }
        )
    }
}
