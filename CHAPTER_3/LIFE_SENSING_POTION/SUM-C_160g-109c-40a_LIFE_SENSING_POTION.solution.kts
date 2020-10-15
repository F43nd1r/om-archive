
solution {
    puzzle = "P030b"
    name = "B S"
    arm(ARM6) {
        number = 1
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to -3
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -3 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to -3
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                wait(6)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
