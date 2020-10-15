
solution {
    puzzle = "P105"
    name = "B GCX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 8 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 0
        rotation = -1
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
        position = 8 to 0
        rotation = 2
    }
    glyph(ANIMISMUS) {
        position = 0 to -1
        rotation = -2
    }
    glyph(UNIFICATION) {
        position = 0 to 1
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = 6
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -3 to 2)
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
                drop()
                rotateClockwise()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                back()
                back()
                drop()
                grab()
                forward()
                drop()
                forward()
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
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
                repeat()
                wait(11)
                repeat()
                wait(13)
                repeat()
                wait(11)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                forward()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(22)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(23)
                rotateCounterClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
