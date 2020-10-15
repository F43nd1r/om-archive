
solution {
    puzzle = "P102"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = -3 to -2
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -5 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -4
        rotation = 8
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to 4
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 1
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -6 to 6
        rotation = 5
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = -4 to 3
        rotation = 4
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = -3 to 3
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = -9
    }
    io(INPUT) {
        index = 1
        position = -2 to -3
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = -6 to 3
        rotation = -3
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, -1 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                back()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                wait(3)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                back()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                wait(1)
                grab()
                back()
                drop()
                forward()
                forward()
                grab()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                wait(14)
                rotateCounterClockwise()
                wait(4)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(13)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(3)
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
