
solution {
    puzzle = "w1698787102"
    name = "B X S F PENTAPIG"
    arm(ARM1) {
        number = 1
        position = -3 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to -3
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -5 to 1
        rotation = -1
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = -4 to -2
        rotation = -2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = -1 to 2
        rotation = 4
    }
    glyph(UNIFICATION) {
        position = -4 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = -9
    }
    track {
        position = 1 to -1
        positions = listOf(1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = -1 to -3
        positions = listOf(-1 to 0, 0 to 0, -1 to 1)
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -4 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                wait(1)
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                forward()
                wait(1)
                back()
                wait(4)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
