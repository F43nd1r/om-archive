
solution {
    puzzle = "P105"
    name = "B GI 1-6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 8 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 9 to 0
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 10 to 0
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 7 to 0
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = 1 to -1
        rotation = 5
    }
    glyph(UNIFICATION) {
        position = -1 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = 12
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    track {
        position = 8 to 1
        positions = listOf(0 to 0, 1 to -1)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 10 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(16)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(68)
                rotateClockwise()
            }
        }
        )
    }
}
