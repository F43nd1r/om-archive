
solution {
    puzzle = "P101"
    name = "NEARLY GOT IT (SUM4)"
    arm(ARM1) {
        number = 1
        position = -5 to 2
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 3
        rotation = 9
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 7
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 9
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = 7
    }
    glyph(PURIFICATION) {
        position = -5 to 3
        rotation = 29
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = -25
    }
    io(INFINITE) {
        index = 0
        position = 3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -6 to 3
        rotation = 0
    }
    track {
        position = -2 to 3
        positions = listOf(1 to 0, 0 to 0)
    }
    track {
        position = 1 to -1
        positions = listOf(2 to 1, 1 to 1, 0 to 1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateCounterClockwise()
                back()
                forward()
                pivotClockwise()
                back()
                wait(1)
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(22)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                grab()
                forward()
                back()
                rotateClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                back()
                back()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
            }
        }
        )
    }
}
